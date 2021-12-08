
public class lotokombinacije {

	public static void main(String[] args) {
		int stevec=0;
		for(int i = 1;i<=33;i++)
			for(int j=i+1;j<=34;j++)
				for(int k = j+1;k<=35;k++)
					for(int l = k+1;l<= 36;l++)
						for(int m = l+1;m<=37;m++)
							for(int n = m+1;n<= 38;n++)
								for(int o =n+1;o<=39;o++){
									stevec++;
									//System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o);
								}
		System.out.println(stevec);
		
	}

}
