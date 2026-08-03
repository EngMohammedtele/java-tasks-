public class StringDemo {
    public void main(String[] args) {



//        String greeting = "hola cucurella ";
//        greeting.toUpperCase();
//        IO.println(greeting);
//        String upperCaseGreeting = greeting.toUpperCase();
//        IO.println(upperCaseGreeting);
//    }
//    }
//void main() {
    /*String s = "   hola cucurella     ";
    Integer strlen = s.length();
    IO.println(s.strip());
    String str1 = "                                 ";
    IO.println((str1.strip()).isBlank());
    IO.println((str1.strip()).isEmpty());
    String str2 = "  hola cucurella      ";
    Integer str2len = str2.length();
    IO.println(str2.strip());
    IO.println((str2.strip()).isBlank());
    IO.println((str2.strip()).isEmpty());
    String input = IO.readln("enter your name kid :");
    if (input.isBlank()) {
        IO.println(("Name is require "));
    }
    String email = IO.readln("enter email pls ").strip();
    IO.println(email.indexOf("@")); *//**/
//}

//String t = "Hello Codeline World";
//        // 0123456789...
//IO.println(t.indexOf("Codeline"));
//IO.println(t.indexOf("Java"));
//IO.println(t.lastIndexOf("o"));
//IO.println(t.contains("World"));
//IO.println(t.startsWith("Hello"));
//IO.println(t.endsWith("World"));
//        }
//        }
//

/*    String t = "Hello codeline world ";
    IO.println(t.charAt(16));
    IO.println(t.charAt(50));*/

//    String file = "report.pdf";
//    Integer dot = file.lastIndexOf(".");
//    IO.println("File name is "+ file.substring(0,dot));

//                String t = "Hello codeline world";
//                IO.println("Hello code legent");
//                IO.println(t.replace('o', 'O'));
//                IO.println(t.replace("Hello","Hi"));
//                String [] parts = t.split("     ");
                String csvRow= "ahmed,25,9876543";
        String [] parts = csvRow.split(",");
        IO.println("name:" + parts[0]);
        IO.println("LaGE:" + parts[1]);
        IO.println("pfone:" + parts[2]);

    }
}