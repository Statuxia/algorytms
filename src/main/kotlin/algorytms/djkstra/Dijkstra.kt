package algorytms.djkstra


fun main() {
    val graph = Graph().initGraph()
    val start = graph.getStart()
    nodeProcessing(start)
    println("MinCost: " + graph.getMinCost())
}

fun nodeProcessing(node: Node) {
    println(node.getName() + ": " + node.getCost())
    if (node.isProcessed()) {
        return
    }
    node.setProcessed()

    val nodes = node.getNodes()
    for (childNode in nodes) {
        if (childNode.key.getCost() > node.getCost() + childNode.value) {
            childNode.key.setCost(node.getCost() + childNode.value)
        }
        nodeProcessing(childNode.key)
    }
}