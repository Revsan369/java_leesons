package koreait.day07;



public class C41_StudentScore {
	public static void main(String[] args) {
		 
		Student[] stus = new Student[5];//배열요소 10개 //배열료소 5개
		String[]names = {"이하니","김모모","박나연","홍길동","박지성"};
		stus[0] =new Student();
		stus[0].name = names[0];
		stus[0].no =1;
		stus[0].grade=3;
		
		for(int i=1;i<stus.length;i++) {
			stus[i] =new Student(); //***
			stus[i].name = names[i];
			stus[i].no =i+1;
			stus[i].grade=3;

		}
		for(int i=0;i<stus.length;i++) 
			System.out.println(stus[i]);
		
		//각 student 개체에 score을 필드로 받도록
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].name +"점수 입력");
			stus[i].score = new Score();
			stus[i].score.input();
			System.out.println(stus[i]);
		}
			System.out.println("[[성적 통계]]");
			System.out.printf("%8s %10s %8s %8s\n", "no","name","sum","average");
			for(int i=0;i<stus.length;i++)
					System.out.printf("%4s %6s %8s\n",stus[i].no,stus[i].name, 
							stus[i].score.sum(),stus[i].score.average());

//			Score temp = new Score();//***
//			temp.input();
//			stus[i].score =temp;//***
//			System.out.println(stus[i]);//확인
			
		
	}

}
