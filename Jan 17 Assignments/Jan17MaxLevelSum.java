package AssignmentsWeek5;

public class Jan17MaxLevelSum {
	void maxLevelSum(struct Node* root)
	{
	    if (root == NULL)
	        return 0;
	    int result = root->data;
	    queue<Node*> q;
	    q.push(root);
	    while (!q.empty())
	    {
	        int count = q.size();
	        int sum = 0;
	        while (count--)
	        {
	            Node* temp = q.front();
	            q.pop();
	            sum = sum + temp->data;

	            if (temp->left != NULL)
	                q.push(temp->left);
	            if (temp->right != NULL)
	                q.push(temp->right);
	        }
	 
	        result = max(sum, result);
	    }
	 
	    System.out.println(result);
	}

