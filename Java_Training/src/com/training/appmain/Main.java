/**
 * 
 */
package com.training.appmain;

/**
 * @author Swapnil
 *
 */
public class Main {

	/**
	 * @param args
	 */

    public static void main(String[] args) {
        System.out.println("Hello World");
	/*System.out.println("hello world 2");
        for(int i = 0;i<=10;i++){
            System.out.println(i);
     */

        //Integer Types
        byte bByte8 = 127;
        short sShort16 = 32767;
        int iInt32 = 2147483647;
        long lLong64 = 922337203685477L;
        //Floating Point
        float fFloat32 = 111.11f;
        double dDouble64 = 111.11111111d;
        //Boolean and Char
        char regularU = 'U';
        char accentedU = '\u00DA'; //00DA -> four digit hex value
        boolean b1 = true;
        //Prefix and Postfix Operator
        int prefixO = 5;
        System.out.println(prefixO++); /*6*/
        System.out.println(prefixO); /*6*/
        int postO = 5;
        System.out.println(++postO); /*5*/
        System.out.println(postO); /*6*/
        //Compound Assignment Operator +=, -=, /=, %=. , Right side to Left side operation and stores value in left side
        int cmpPlus = 50;
        cmpPlus -= 5;/*45 result is stored into cmpPlus*/

        int cmpResult = 100;
        int cmpValue1 = 5;
        int cmpValue2 = 10;
        cmpResult /= cmpValue1 * cmpValue2;/*100 / 5 -> 2 result is stored into cmpResult*/

        //Operator Precedence
        //x++ x-- postfix processed first
        //++x --x prefix processed second
        //Multiplicative (*, /, %) processed third
        //Additive (+, -) processed last
        // int res = 21 - 6 / 3 -> 19
        // int res = (21 - 6) / 3 -> 5
        // int res = 21 / 3 * 1 + 6 -> 13 -> From left to right when multiple same precedence operator are there
        // int res = 21 / (3 * (1 + 6)) -> 1 -> Parantheses are executed first

        //Type conversion
        //Implicit type conversion - conversion performed automatically by compiler
        int iVal = 50;
        long lVal = iVal;
        //Explicit type conversion - conversion performed explicitly in code with cast operator
        long leVal = 50;
        int ieval = (int) leVal;

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        short result1 = (short) byteVal;
        short result2 = (short) (byteVal - longVal);
        double result3 = longVal - doubleVal;
        long result4 = (long) (shortVal - longVal + floatVal + doubleVal);

        //If statement with block statement {}
        //Variable declared inside the block remains within block and cannot be used outside
        //Variable declared prior to block can be used inside the block
        float students = 0.0f, rooms = 4.0f;
        if (students > 0.0f) {
            if (rooms > 0.0f)
                System.out.println(students / rooms);
            else
                System.out.println("No Rooms");
        } else
            System.out.println("No Students");

        //Logical operators
        // & - AND resolves to True when both side is tru
        // | - OR resolves to true when TRUE | TRUE, TRUE | FALSE, FALSE | TRUE
        // ^ - XOR resolves to true when TRUE | FALSE, FALSE | TRUE
        // ! - Negation resolves to true when condition is false
        // && - Conditional AND resolves to true only when TRUE && TRUE, It executes right-side only if left-side is true
        // || - Conditional OR resolves to true when FALSE || TRUE, TRUE ||-----.Only executes right-side if left-side is false

        int lStudents = 150, lRooms = 0;
        if (lRooms > 0 && lStudents / lRooms > 30) {
            //If we use only & then will get compiler error as it will try to execute both condition
            //However, with &&, it will execute left-side first and if its false then it will not execute right side
            System.out.println("Crowded....");
        }

        // Mini  Calculator
        double cvalue1 = 100.0d;
        double cvalue2 = 50.0d;
        double cresult;
        char copCode = 'a';

        if (copCode == 'a')
            cresult = cvalue1 + cvalue2;
        else if (copCode == 's')
            cresult = cvalue1 - cvalue2;
        else if (copCode == 'd') {
            cresult = cvalue1 != 0.0d ? cvalue1 / cvalue2 : 0.0d;
            // result = <condition> ? <value if true> : <value if false>
        } else if (copCode == 'm')
            cresult = cvalue1 * cvalue2;
        else {
            System.out.println("Error - Invalid code");
            cresult = 0.0f;
        }
        System.out.println(cresult);
        //While loop execute till the time condition becomes false
        int wVal = 5, wFact = 1;
        while (wVal > 1) {
            //wFact *= wVal; wVal -= 1; This statement and below does same job.
            wFact *= wVal--; //
            System.out.println("While loop: " + wVal + " " +wFact);
        }
        System.out.println("While loop: " + wFact);
        //Do...While executes until condition becomes false. This loop executes at least one
        int dwVal = 1;
        do {
            System.out.print(dwVal);
            System.out.print("* 2 =");
            dwVal *= 2;
            System.out.println(dwVal);

        } while (dwVal < 100);
        //For loop is same as While loop however more convenient. This code and above while loop code does exactly same.
        //for(initialize; condition; update)
        //Statement;
        dwVal = 1;
        for (dwVal = 1; dwVal < 100; dwVal *= 2) {
            System.out.println(dwVal);
        }
        //Array. Length returns the length of array
        float[] fVals = new float[3];
        fVals[0] = 10.0f;
        fVals[1] = 15.0f;
        fVals[2] = 20.0f;
        float sum = 0.0f;

        for (int i = 0; i < fVals.length; i++)
            sum += fVals[i];
        System.out.println(sum);

        int[] iVals = {1, 2, 3, 4};
        sum = 0;
        for (int i = 0; i < iVals.length; i++)
            sum += iVals[i];
        System.out.println(sum);
        //For each loop, for each item in array
        sum = 0;
        for (float feCurrentVal : fVals)
            sum += feCurrentVal;
        System.out.println(sum);

        //Switch statement. Below example is useful for validating odd and even number
        int sVal = 25;
        switch (sVal % 2) {
            case 0:
                System.out.print(sVal);
                System.out.println(" is even");
                break;
            case 1:
                System.out.print(sVal);
                System.out.println(" is odd");
                break;
            default:
                System.out.print(sVal);
                System.out.println("oops its broke");
                break;
        }

        //Switch statement with array
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length]; //.length returns the length of array and starts with 0

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
            }
        }
        for (double theResult : results) {
            System.out.print("result = ");
            System.out.println(theResult);
        }

        // Class
        //Add new class from File -> New -> Java class
        //It will be separate .java file containing executable code (fields, constructor and method)
        Flight nycTosf;
        nycTosf = new Flight();
        nycTosf.add1Passenger();
        System.out.println(nycTosf.passangers); //prints 1 because methos is called prior to printing variable

        Flight dnvTolv = new Flight();
        System.out.println(dnvTolv.passangers); //prints 0 because methos is not called prior to printing variable

        nycTosf.add1Passenger();
        dnvTolv.add1Passenger();
        System.out.println(dnvTolv.passangers); //prints 1 because two separate reference to class

        dnvTolv.add1Passenger();
        nycTosf = dnvTolv;
        System.out.println(nycTosf.passangers);
        //prints 2 because methos is called two time prior to printing variable and class value is assigned to calls

        //Calling method with parameters
        //method can also be passed to method as an parameter and its variable can be used there
        Flight amdTomu = new Flight();
        amdTomu.add2Passenger(4, 4, nycTosf);
        System.out.println(amdTomu.passangers);

        Flight extraFlight = null; //Null means an uncreated object and can be assigned to any reference variable
        if (extraFlight != null)
            System.out.println("Extra flight needed");

        //Field Encapsulation
        //In most cases, a class’ fields should not be directly accessible outside of the class
        //Helps to hide implementation details
        //Use methods to control field access
        //Accessors and Mutators
        /*Use the accessor/mutator pattern to control field access
            Accessor retrieves field value, Also called getter, Method name: getFieldName
            Mutator modifies field value, Also called setter, Method name: setFieldName
        */
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;

    }

    //Field Initializer - Can be simple assignment, an equation, reference other field, can be a method call

    public class Eart    {
        long miles = 24901;
        double km1 = 24901 * 1.6;
        long km2 = (long) (miles * 1.6);
        long km3 = Math.round(miles * 1.6);
    }




}
