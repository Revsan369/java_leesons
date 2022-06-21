package koreait.day07;

import java.util.Arrays;

//
public class Singer {

	
		// 클래스 정의 하는것은 현실데이터 처리
		//singer 맥체가 만들어질때마다  변경 instance
		String genre;
		String name_eng;
		String name_kor;
		int debutYear;
		String[] members;
		
		void  printMembers() {
			if(members ==null)
							System.out.println(("그룹니 아닙니다"));
							else
								for(int i=0;i<members.length;i++) {
						if (members[i]!=null )
							System.out.println((i+1) + ":" + members[i]);
					}
			}	
			
		
		static final String JOB = "연예인";
		static String label = "※";
		
		
		int actYears(int year) {
			return year-debutYear+1;
		}


		@Override
		public String toString() {
			return "Singer [genre=" + genre + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutYear="
					+ debutYear + ", members=" + Arrays.toString(members) + "]";
		}
		}


