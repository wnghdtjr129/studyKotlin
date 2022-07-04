package ch04

class CountingSet<T>(val innerSet: MutableCollection<T>): MutableCollection<T> by innerSet{
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

class CountingSetNormal<T>(_innerSet: MutableCollection<T>) : MutableCollection<T>{
    var objectsAdded = 0
    private val innerSet = _innerSet
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<T> {
        TODO("Not yet implemented")
    }

    override fun remove(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

}

fun main() {
    val set = CountingSet<Int>(HashSet())

    set.add(1)
    set.addAll(listOf(2,3,4))

    println("${set.objectsAdded} objects were added, ${set.size} remain")

    val set1 = CountingSetNormal<Int>(HashSet())

    set1.add(1)
    set1.addAll(listOf(2,3,4))

    println("${set1.objectsAdded} objects were added, ${set1.size} remain")

}