
package gt.edu.umg.sistema.is.OpenClosePrincipleProblemApp.Model;

public class Part {

     public static String ReplacePart(String part) {
        switch (part.toLowerCase()){
            case "llantas":
                return part + " remplazadas";
            case "aceite":
                return part + " remplazado";
            case "carburador":
                return part + "remplazado";
            case "aceite de frenos":
                return part + " remplazados";
            case "pintura":
                return part + "remplazada";
            default:
                return "ERROR:" + part +" no exist!!!";
        }
    }

}
