import java.util.stack;
public class PostfixEvalution {
	public static int EvaluatePostfix(String expression) {
		stack<Integer>stack=new stack<>();
		for(int i=0;i<expression.length();i++) {
			char ch=expression.charAt(i);
			if(character.isDigit(ch)) {
				stack.push(ch-'0');
			} else {
				int operator2=stack.pop();
				int operator1=stack.pop();
				switch(ch) {
				case'+':
					stack.push(operator1+operator2);
					break;
				case'-':
					stack.push(operator1-operator2);
					break;
				case'*':
					stack.push(operator1*operator2);
					break;
				case'/':
					stack.push(operator1/operator2);
					break;
			}
		}
	} 
public static void main (String[]args ) {
	string (postfixExpression="231*+9-");
	int result=evaltuatepostfix(postfixExpression);
	System.out.println("the result of the postfix expression\""+postfixexpression+"\" is:"+result);
}
}
		
		
	
