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

    fun push(value: T) {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }//push

}//LinkedList