package algorytms.djkstra

class NegativeNumberException(node: Node, length: Int) :
    Exception("Negative length (${length}) excepted in ${node.getName()}")