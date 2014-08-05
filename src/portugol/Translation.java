package portugol;

//import portugol.analysis.*;
//import portugol.node.*;

import expression.analysis.*;
import expression.node.*;

public class Translation extends DepthFirstAdapter
{

	@Override
	public void defaultIn(Node node) {
		// TODO Auto-generated method stub
		System.out.println(node.toString());
		super.defaultIn(node);
	}


}
