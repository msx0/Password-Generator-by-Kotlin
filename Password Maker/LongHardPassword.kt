package TestCodes

class LongHardPassword {



        private val password = ("abcdawertyuiokjhgfdl1209376583@_@/$%^")
        private val numbers = arrayOf(1,3,4,5,2,0,4,6,7,'@','#','_','/')




        fun passwordMaker(a: Int):String{




            for (i in 0 until a){


                var xyz = password.toString()
                print(xyz.random())




            }

            return password.toString()



        }

    }