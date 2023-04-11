package algorytms.djkstra

class Node(private val name: String) {
    private val nodeMap = mutableMapOf<Node, Int>()
    private var processed: Boolean = false
    private var length: Int = Int.MAX_VALUE

    fun getName(): String {
        return name
    }

    fun getNodes(): MutableMap<Node, Int> {
        return nodeMap
    }

    fun getLength(): Int {
        return length
    }

    fun isProcessed(): Boolean {
        return processed
    }

    fun setNode(node: Node, length: Int): Node {
        if (length < 0) {
            throw NegativeNumberException(node, length)
        }
        nodeMap[node] = length
        return this
    }

    fun setLength(length: Int): Node {
        this.length = length
        return this
    }

    fun setProcessed(b: Boolean): Node {
        processed = b
        return this
    }
}