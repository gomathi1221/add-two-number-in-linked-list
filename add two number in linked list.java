class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode res=new ListNode(0);
      ListNode reshead=res;
      int c=0;
      int x,y;
      while(l1!=null||l2!=null){
        if(l1!=null){
            x=l1.val;
        }
        else{
            x=0;
        }
        if(l2!=null){
            y=l2.val;
        }
        else{
            y=0;
        }
        int sum=x+y+c;
        c=sum/10;
        reshead.next=new ListNode(sum%10);
        reshead=reshead.next;
        if(l1!=null){
            l1=l1.next;
        }
        if(l2!=null){
            l2=l2.next;
        }
        
      }
      if(c>0){
        reshead.next=new ListNode(c);
        
      }
      return res.next;


           
    }
}