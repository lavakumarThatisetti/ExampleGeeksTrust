import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FindCosuin {

    public boolean isBothCousions(TreeNode node, int child1, int child2){
        if( node == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        queue.add(node.val);
        map.put(node.val,null);
        Integer parent1, parent2;
        while(queue.size()>0){
            int n= queue.size();
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                    map.put(node.left, node);
                }
                if(node.right !=null){
                    queue.add(node.right);
                    map.put(node.right, node);
                }
                if(map.get(node)==child1){
                    parent1 = map.get(node);
                }
                if(map.get(node)==child2){
                    parent2 = map.get(node);
                }
            }
            if(parent1 == parent2) {
                return false;
            }
        }
      while (parent1!=null || parent2!=null) {
          if (map.get(parent1) == node.val && map.get(parent2)== node.val) {
              return true;
          } else {
              parent1 = map.get(parent1);
              parent2 = map.get(parent2);
          }
      }
      if(parent1 !=null && parent2!=null && parent1 == parent2) return true;
      return false;
    }

    public static void main(String[] args) {

    }
}
