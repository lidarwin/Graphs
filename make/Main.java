package make;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;

/** Initial class for the 'make' program.
 *  @author Darwin Li
 */
public final class Main {

    /** Entry point for the CS61B make program.  ARGS may contain options
     *  and targets:
     *      [ -f MAKEFILE ] [ -D FILEINFO ] TARGET1 TARGET2 ...
     */
    public static void main(String... args) {
        nameToDate = new HashMap<String, Integer>();
        int currDate;

        if (args.length == 0) {
            usage();
        }

        String makefileName = "Makefile";
        String fileInfoName = "fileinfo";

        int a;
        for (a = 0; a < args.length; a += 1) {
            if (args[a].equals("-f")) {
                a += 1;
                if (a == args.length) {
                    usage();
                } else {
                    makefileName = args[a];
                }
            } else if (args[a].equals("-D")) {
                a += 1;
                if (a == args.length) {
                    usage();
                } else {
                    fileInfoName = args[a];
                }
            } else if (args[a].startsWith("-")) {
                usage();
            } else {
                break;
            }
        }

        ArrayList<String> targets = new ArrayList<String>();

        Scanner fileInfoScanner = new Scanner(new File(fileInfoName));
        currDate = fileinfoScanner.nextInt();
        while (fileInfoScanner.hasNextLine()) {
            String[] lines = fileInfoScanner.split("[ ]+");
            nameToDate.put(lines[0], Integer.parseInt(lines[1]));
        }
        fileInfoScanner.close();

        for (; a < args.length; a += 1) {
            targets.add(args[a]);
        }

        //Make a boolean to tell whether you are looking for a command set. Then use a while loop to parse for commandset ONLY with that boolean value
        // or make a clone of a scanner?

        Scanner _inp = new Scanner(new File(makeFileinfo));
        while (_inp.hasNextLine()) {
            String temp = _inp.nextLine();
            while (temp.matches("#.*||[ \t]+") {
                temp = _inp.nextLine();
            }
            ArrayList<String> prereq;
            String[] line = temp.split("[ ]+");
            if (line[0].matches("\\.?[a-zA-Z\\-]+||$\\([a-zA-Z\\-]+\\)") {
                if (line[0].charAt(line[0].length() - 1) == ":") {//may not be ncessary because no macros
                    String tempRule = line[0].substring(0, line[0].length() - 2);
                    for (int i = 1; i < line.size(); i += 1) {
                        prereq.add(line[i]);
                        if (line[i].matches("?[a-zA-Z\\-]+.java")) { //also handle macros, but not here
                            // check the date of the .java file to make sure it is up to date, but not here
                        } else if (line[i].matches()) {

                        }
                    }
                    if ()
                }
            } else if (line[1].matches(":") && line[0].charAt(line[0].length - 1) != ":") {
                macros.add(line[0]);
            } else {
                return error;
            }
        }

        make(makefileName, fileInfoName, targets);
    }

    /** Carry out the make procedure using MAKEFILENAME as the makefile,
     *  taking information on the current file-system state from FILEINFONAME,
     *  and building TARGETS, or the first target in the makefile if TARGETS
     *  is empty.
     */
    private static void make(String makefileName, String fileInfoName,
                             List<String> targets) {

    }


    /** Parse the TARGET according to FILEINFONAME.*/
    private static void readFileInfoName(String fileinfoname, ArrayList<String> target) {

    }

    /** Parse the TARGET according to MAKEFILENAME.*/
    private static void readMakeFileName(String makefilename, ArrayList<String> target) {
        
    }

    /** Print a brief usage message and exit program abnormally. */
    private static void usage() {
        printHelpResource(HELP, System.out);
        System.exit(1);
    }




    /** Name of resource containing help message. */
    private static final String HELP = "make/Help.txt";

    /** Print the contents of the resource named NAME on OUT.
     *  NAME will typically be a file name based in one of the directories
     *  in the class path.  */
    static void printHelpResource(String name, PrintWriter out) {
        try {
            InputStream resource =
                Main.class.getClassLoader().getResourceAsStream(name);
            BufferedReader str =
                new BufferedReader(new InputStreamReader(resource));
            for (String s = str.readLine(); s != null; s = str.readLine())  {
                out.println(s);
            }
            str.close();
            out.flush();
        } catch (IOException excp) {
            out.printf("No help found.");
            out.flush();
        }
    }

    /** Function that creates the rule list from TARGETS.*/
    void ruleListMaker(ArrayList<String> targets) {
        for (int i = 0; i < targets.size(); i += 1)
            
    }

    /** A hashmap that goes from Strings to Integers.*/
    HashMap<String, Integer> nameToDate;

    /** An arraylist of Rules.*/
    ArrayList<Rules> RuleList;


}
