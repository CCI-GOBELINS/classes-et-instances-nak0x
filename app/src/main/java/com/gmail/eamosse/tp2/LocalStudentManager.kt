package com.gmail.eamosse.tp2

class LocalStudentManager : StudentManager {
    private val studentList = mutableListOf(
        Student(name = "John1", code = "A1", sex = "M", address = "Lilles", age = 20),
        Student(name = "John2", code = "A2", sex = "F", address = "Lilles", age = 30),
        Student(name = "John3", code = "A3", sex = "F", address = "Lilles", age = 41),
        Student(name = "John4", code = "A4", sex = "M", address = "Lilles", age = 42),
        Student(name = "John5", code = "A5", sex = "M", address = "Lilles", age = 34),
        Student(name = "John6", code = "A6", sex = "F", address = "Lilles", age = 12),
        Student(name = "John7", code = "A7", sex = "M", address = "Lilles", age = 28),
        Student(name = "John8", code = "A8", sex = "M", address = "Lilles", age = 16),
        Student(name = "John9", code = "A9", sex = "F", address = "Lilles", age = 10),
        Student(name = "John10", code = "A10", sex = "F", address = "Lilles", age = 56),
    )

    override fun sortAgeAscDesc(type: String): List<Student> = when (type) {
        "desc" -> studentList.sortedByDescending { it.age }
        "DESC" -> studentList.sortedByDescending { it.age }
        else   -> studentList.sortedBy { it.age }
    }
    override fun listOf10(): List<Student> = studentList.take(10)
    override fun clear() = studentList.clear()
    override fun groupBySex(): Map<String, List<Student>> = studentList.groupBy { it.sex }
    override fun boysOrGirls(sex: String): List<Student> = studentList.filter { it.sex == sex }
    override fun deleteBySex(sex: String) { studentList.removeAll { it.sex == sex } }
    override fun onlyNames(): List<String> = studentList.map { it.name }
    override fun reverse(): List<Student> = studentList.reversed()
}
