class Solution {

    public int numberOfChild(int n, int k) {

        int position = 0;
        int direction = 1;

        while(k-- > 0) {

            if(position == n - 1) {
                direction = -1;
            }
            else if(position == 0) {
                direction = 1;
            }

            position += direction;
        }

        return position;
    }
}
