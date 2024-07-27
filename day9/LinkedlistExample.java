//  @3  linkedlist
package day9;

import java.util.LinkedList;

public class LinkedlistExample
{

	public static void main(String[] args) 
	{
	
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		
		System.out.println(ll);
		
		for(Integer n :ll)
		{
			System.out.println(n);
		}
		
		ll.remove(2);
		
		System.out.println("after remove");
		for(Integer n :ll)
		{
			System.out.println(n);
		}
		System.out.println("add last");
		ll.addLast(100);
		for(Integer n :ll)
		{
			System.out.println(n);
		}
		
		
		System.out.println("add first");
		ll.addFirst(5);
		for(Integer n :ll)
		{
			System.out.println(n);
		}
		
		ll.set(0, 6);
		System.out.println("after update");
		
		for(Integer n :ll)
		{
			System.out.println(n);
		}
	}
	
	
}

=================================================================

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None

    # a. Insert at the beginning
    def insert_at_beginning(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    # b. Insert at given position
    def insert_at_position(self, data, position):
        if position < 0:
            print("Invalid position.")
            return
        if position == 0:
            self.insert_at_beginning(data)
            return

        new_node = Node(data)
        current = self.head
        count = 0

        while current and count < position - 1:
            current = current.next
            count += 1

        if not current:
            print("Position is out of range.")
            return

        new_node.next = current.next
        current.next = new_node

    # c. Insert after a given node
    def insert_after_node(self, prev_node, data):
        if not prev_node:
            print("Previous node is None.")
            return

        new_node = Node(data)
        new_node.next = prev_node.next
        prev_node.next = new_node

    # d. Delete at the beginning
    def delete_at_beginning(self):
        if self.head:
            self.head = self.head.next
        else:
            print("List is empty. Cannot delete.")

    # e. Delete at given position
    def delete_at_position(self, position):
        if position < 0:
            print("Invalid position.")
            return
        if position == 0:
            self.delete_at_beginning()
            return

        current = self.head
        count = 0

        while current and count < position - 1:
            current = current.next
            count += 1

        if not current or not current.next:
            print("Position is out of range.")
            return

        current.next = current.next.next

    # f. Delete after a given node
    def delete_after_node(self, prev_node):
        if not prev_node or not prev_node.next:
            print("Previous node is None or the next node is None.")
            return

        prev_node.next = prev_node.next.next

    # g. Reverse the linked list
    def reverse(self):
        prev = None
        current = self.head

        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node

        self.head = prev

    def display(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")

# Example usage:
if __name__ == "__main__":
    linked_list = SinglyLinkedList()
    linked_list.insert_at_beginning(1)
    linked_list.insert_at_beginning(2)
    linked_list.insert_at_beginning(3)
    linked_list.insert_at_position(4, 1)
    linked_list.insert_after_node(linked_list.head.next, 5)
    linked_list.display()

    linked_list.delete_at_beginning()
    linked_list.delete_at_position(1)
    linked_list.delete_after_node(linked_list.head.next)
    linked_list.display()

    linked_list.reverse()
    linked_list.display()

