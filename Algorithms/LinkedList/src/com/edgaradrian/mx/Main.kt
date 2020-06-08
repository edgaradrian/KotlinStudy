package com.edgaradrian.mx

fun main() {
    printNodeExample()
    printPushOperation()
    printAppendOperation()
}//main

private fun printNodeExample() {
    println(">>>> Node Example <<<<")
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3

    println(node1)
}//printNodeExample

private fun printPushOperation() {
    println(">>>> Push Operation <<<<")
    val list = LinkedList<Int>()
    list.push(3).push(2).push(1)

    println(list)
}//printPushOperation

private fun printAppendOperation() {
    println(">>>> Append Operation <<<<")
    var list = LinkedList<Int>()
    list.append(1)
    list.append(2)
    list.append(3)

    println(list)
}//printAppendOperation