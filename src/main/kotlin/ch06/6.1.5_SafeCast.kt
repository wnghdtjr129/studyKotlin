package ch06

class PersonCh06(val firstName: String, val lastName: String){
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonCh06 ?: return false
        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }
}