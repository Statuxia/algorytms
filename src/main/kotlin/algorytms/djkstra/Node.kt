package algorytms.djkstra

class Node(private val name: String) {
    private val nodeMap = mutableMapOf<Node, Int>()
    private var processed: Boolean = false
    private var cost: Int = Int.MAX_VALUE

    fun getName(): String {
        return name
    }

    fun getNodes(): MutableMap<Node, Int> {
        return nodeMap
    }

    fun getCost(): Int {
        return cost
    }

    fun isProcessed(): Boolean {
        return processed
    }

    fun setNode(node: Node, price: Int): Node {
        nodeMap[node] = price
        return this
    }

    fun setCost(price: Int): Node {
        cost = price
        return this
    }

    fun setProcessed(): Node {
        processed = true
        return this
    }
}