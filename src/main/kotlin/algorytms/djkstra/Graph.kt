package algorytms.djkstra

class Graph {
    private val start = Node("start").setCost(0)
    private val end = Node("end")
    private var started = false
    fun initGraph(): Graph {
        val a = Node("a")
        val b = Node("b")

        start.setNode(a, 6)
        start.setNode(b, 2)

        b.setNode(a, 3)
        b.setNode(end, 5)

        a.setNode(end, 1)
        return this
    }

    fun getStart(): Node {
        setStarted()
        return start
    }

    fun getMinCost(): Int? {
        if (!isStarted()) {
            return null
        }
        return end.getCost()
    }

    private fun isStarted(): Boolean {
        return started
    }

    private fun setStarted() {
        started = true
    }
}