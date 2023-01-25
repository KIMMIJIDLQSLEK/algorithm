class Solution {
    public String solution(int[] numbers, String hand) {
        //1,4,7 일경우 L
        //3,6,9 일경우 R
        //2,5,8,0 일경우 현재 오른쪽, 왼쪽 손가락 중 가까운 손
        //거리가 동일할 경우 오른손잡이 일경우 R, 왼손잡이인 경우 L


        //L,R 일경우 현재 위치 좌표 초기화
        //2,5,7,0 일경우 현재 위치 좌표 구한 후 가까운 거리 확인
        //동일할경우 hand확인 후 기록

        String answer="";
        int lx=0,ly=3; //*
        int rx=2,ry=3; //#

        for(int num:numbers){
            if(num%3==1){
                lx=0;
                ly=num/3;
                answer+='L';

            }
            else if(num%3==2 || num==0){
                int nx=1;
                int ny=num/3;
                if(num==0){
                    ny=3;
                }

                if(Math.abs(nx-lx)+Math.abs(ny-ly)>Math.abs(nx-rx)+Math.abs(ny-ry)){
                    rx=nx;
                    ry=ny;
                    answer+='R';
                }else if(Math.abs(nx-lx)+Math.abs(ny-ly)<Math.abs(nx-rx)+Math.abs(ny-ry)) {
                    lx=nx;
                    ly=ny;
                    answer+='L';
                }else{
                    if(hand.equals("right")){
                        rx=nx;
                        ry=ny;
                        answer+='R';
                    }else{
                        lx=nx;
                        ly=ny;
                        answer+='L';
                    }
                }

            }else{
                rx=2;
                ry=num/3-1;
                answer+='R';

            }
        }
        return answer;
    }

}