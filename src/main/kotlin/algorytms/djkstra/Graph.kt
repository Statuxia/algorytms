package algorytms.djkstra

class Graph {
    private val start = Node("start").setLength(0)
    private val end = Node("end")

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