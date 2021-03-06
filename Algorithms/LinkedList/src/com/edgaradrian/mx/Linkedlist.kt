package com.edgaradrian.mx

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }//isEmpty

    override fun toString(): String {
        return if (isEmpty()) {
            return "Empty List"
        } else {
            return head.toString()
        }
    }//toString

    fun push(value: T): LinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }//push

    fun append(value: T) {
        if (isEmpty()) {
            push(value)
            return
        }

        tail?.next = Node(value = value)

        tail = tail?.next
        size++
    }//append

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }//nodeAt

    fun insert(value: T, afterNode: Node<T>): Node<T> {

        if (tail == afterNode) {
            append(value)
            return tail!!
        }

        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size ++
        return newNode
    }//insert

    fun pop(): T? {
        if(!isEmpty()) size --
        val result = head?.value
        head = head?.next

        if(isEmpty()) {
            tail = null
        }

        return result

    }//pop

    fun removeLast(): T? {
        val head = head ?: return null
        if (head.next == null) return pop()

        size--

        var prev = head
        var current = head

        var next = current.next
        while (next != null) {
            prev = current
            current = next
            next = current.next
        }

        prev.next = null
        tail = prev
        return current.value

    }//removeLast

    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value

        if (node.next == tail) {
            tail == node
        }

        if (node.next != null) {
            size--
        }

        node.next = node.next?.next
        return result
    }//removeAfter

}//LinkedList