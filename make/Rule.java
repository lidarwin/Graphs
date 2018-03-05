package make;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/** The clas that handles the Rules for the make.
 *  @author Darwin Li
 */
public class Rule {


	protected ArrayList<String> prereqs;

	protected String target;

	protected String command;

	public class Rule(String targ, String comm, ArrayList<String> prereq) {
		prereqs = prereq;
		command = comm;
		target = targ;

	}



	boolean targetExists(String targ) {

	}


}