package algorytms.djkstra

class Graph {
    private val start = Node("start").setLength(0)
    private val end = Node("end")

    fun addNode(nodeFrom: Node, nodeTo: Node, length: Int): Graph {
        nodeFrom.setNode(nodeTo, length)
        return this
    }

    fun getStart(): Node {
        return start
    }

    fun getEnd(): Node {
        return end
    }

    fun getMinLength(): Int {
        return end.getLength()
    }
}