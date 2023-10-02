import javax.swing.text.html.HTML;

public class String_Templates {
    public static void main(String[] args) {
        System.out.println("Program Started.");

        int a =45;
        int b =46;

        System.out.println(STR."value of a is \{a}");
        System.out.println(STR."value of b is \{b}");


        String title= "Contact Page";
        String heading= "Welcome to programming world";
        String body= "Hello, learn java 21 new features. and this is String templates.";

        String html = STR."""
                
                    <html>
                        <head>
                            <title>
                                \{title}
                            </title>
                        </head>
                        <body>
                            <heading>\{heading}</heading>
                            <p>\{body}</p>

                        </body>
                    </html>
                """;
                System.out.println(html);
    }
}
