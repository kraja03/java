package com.sparta.kr.exceptions;

import java.text.ParseException;

public class App {
    public static void main(String[] args) {

//        Animal myDog = new Animal("Fido", 10);
//        Animal myCat = new Animal();
//        try {
//            System.out.println(myDog.getName());
//            System.out.println(myCat.getName());
//        }catch(NullPointerException e){
//            System.out.println("Sorry that animal does not have name, sir.");
//        }
//        System.out.println(myCat.getName_Handled());
//        System.out.println("Program is finished");
//        try {
//            myCat.setVaccinationDate("10-05-2015");
//            // myDog.setVaccinationDate("15 June, 2018");
//            myDog.setVaccinationDate("18-08-2020");
//        }catch(ParseException e){
//            System.out.println("Invalid date format, should me \"dd-MM-yyyy\"");
//        }finally{
//            System.out.println("The animals are: ");
//            System.out.println("myDog: " + myDog);
//            System.out.println("myCat: " + myCat);
//        }


//        try{
//            Animal myHamster = new Animal("Hamish",2, "27-07-2022"); // OK
//            Animal myRabbit = new Animal(null,1, "27-07-2022"); // NullPointerException
//            Animal myOtherDog = new Animal("Fluffy",-2, "27-07-2022"); // IllegalArgumentException
//            Animal myOtherCar = new Animal("Mushy",12, "27 July, 2022"); // Parse Exception
//        } catch (NullPointerException | IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        } catch (ParseException e){
//            System.out.println("Date format is incorrect");
//        } finally {
//            System.out.println("Program is finished");
//        }

        try{
            System.out.println("Do this");
        }


        catch (NullPointerException e) {
            System.out.println("Name cannot be null");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Age cannot be negative");
        }
        catch (RuntimeException e) {
            System.out.println("Caught an RuntimeException object");
        }
        catch (Exception e) {
            System.out.println("Caught an Exception object");
        }
//        catch (ParseException e) {
//            System.out.println("Date format is incorrect");
//        }
    }
}