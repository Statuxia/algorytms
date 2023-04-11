package algorytms.djkstra


fun main() {
    println("Task1 Started")
    task1()
    println("Task1 Ended")
    println("Task2 Started")
    task2()
    println("Task2 Ended")
    println("Task3 Started")
    task3()
    println("Task3 Ended")
    println("Task4 Started")
    task4()
    println("Task4 Ended")
}

fun task1() {
    val graph = Graph()
    val start = graph.getStart()
    val end = graph.getEnd()

    val a = Node("a")
    val b = Node("b")

    // to a
    start.setNode(a, 6)
    b.setNode(a, 3)

    // to b
    start.setNode(b, 2)

    // to end
    b.setNode(end, 5)
    a.setNode(end, 1)

    nodeProcessing(start)
    // MinCost: 6
    println("MinLength: " + graph.getMinCost())
}

fun task2() {
    val graph = Graph()
    val start = graph.getStart()
    val end = graph.getEnd()

    val a = Node("a")
    val b = Node("b")
    val c = Node("c")
    val d = Node("d")

    // to a
    start.setNode(a, 5)
    b.setNode(a, 8)

    // to b
    start.setNode(b, 2)

    // to c
    a.setNode(c, 4)

    // to d
    a.setNode(d, 2)
    b.setNode(d, 7)
    c.setNode(d, 6)

    // to end
    c.setNode(end, 3)
    d.setNode(end, 1)

    nodeProcessing(start)

    // MinCost: 8
    println("MinLength: " + graph.getMinCost())
}

fun task3() {
    val graph = Graph()
    val start = graph.getStart()
    val end = graph.getEnd()

    val a = Node("a")
    val b = Node("b")
    val c = Node("c")

    // to a
    start.setNode(a, 10)
    c.setNode(a, 1)

    // to b
    a.setNode(b, 20)

    // to c
    b.setNode(c, 1)

    // to end
    b.setNode(end, 30)

    nodeProcessing(start)
    println("MinLength: " + graph.getMinCost())
}

fun task4() {
    val graph = Graph()
    val start = graph.getStart()
    val end = graph.getEnd()

    val a = Node("a")
    val b = Node("b")
    val c = Node("c")

    // to a
    start.setNode(a, 2)
    b.setNode(a, 2)

    // to b
    start.setNode(b, 2)
    c.setNode(b, -1)

    // to c
    a.setNode(c, 2)

    // to end
    a.setNode(end, 2)
    c.setNode(end, 2)

    nodeProcessing(start)
    println("MinLength: " + graph.getMinCost())
}

fun nodeProcessing(node: Node) {
    if (node.isProcessed()) {
        return
    }
    node.setProcessed(true)

    val nodes = node.getNodes()
    for (childNode in nodes) {
        if (childNode.key.getLength() > node.getLength() + childNode.value) {
            childNode.key.setLength(node.getLength() + childNode.value)
            childNode.key.setProcessed(false)
        }
        nodeProcessing(childNode.key)
    }
}