/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void solve(int val,List<List<Integer>> result,ArrayList<Integer> list){
        int a=-1,b=-1;
        // just smaller
        int i=0,j=list.size()-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            if(list.get(mid)<=val){
                a=list.get(mid);
                // go for the bigger value 
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        i=0;
        j=list.size()-1;
        // just bigger
         while(i<=j){
            int mid=i+(j-i)/2;
            if(list.get(mid)>=val){
                b=list.get(mid);
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        List<Integer> temp=new ArrayList<>();

        temp.add(a);
        temp.add(b);
        result.add(temp);

    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> q) {
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root,list);
        List<List<Integer>> result = new ArrayList<>();
        for(int i:q){
            solve(i,result,list);
        }
        return result;
    }

    public void inOrder(TreeNode root,ArrayList<Integer>  list){
        if(root==null){
            return ;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);

    }
}