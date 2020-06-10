package com.edgaradrian.mx

fun main() {
    printNodeExample()
    printPushOperation()
    printAppendOperation()
    printInsertOperation()
    printPopOperations()
    printRemoveLastOperations()
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

private fun printInsertOperation() {
    println(">>>> Insert Operation <<<<")
    var list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before inserting $list")
    var middleNode = list.nodeAt(1)!!
    for (i in 1..3) {
        middleNode = list.insert(-1 * i, middleNode)
    }
    println("After inserting $list")

}//printInsertOperation

private fun printPopOperations() {
    println(">>>> Pop Operation <<<<")
    var list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before popping list: $list")
    val poppedValue = list.pop()
    println("After popping list: $list")
    println("Popped value: $poppedValue")

}//printPopOperations

private fun printRemoveLastOperations() {
    println(">>>> Remove Last Operation <<<<")
    var list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before removing last node: $list")
    val removeValue =list.removeLast()

    println("After removing last node: $list")
    println("Removed value: $removeValue")
}//printRemoveLastOperations