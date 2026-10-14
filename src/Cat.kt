class Cat (val name: String, var age: Int, var weight: Int) {

    public fun walk(weightLoss: Int): Boolean {
        if (weightLoss <= 0) {
            return false
        }
        weight -= weightLoss
        return true
    }

    public fun eat(ammount) : Boolean {
       if (weight < 20) {
           weight+=ammount
           return true
       }
        return false
   }


    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
