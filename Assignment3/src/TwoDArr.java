
public class TwoDArr {
	public static void main(String[] args) 
	{
		String[][] arr=new String[][]{{"INDIA","bbsr","hyd","che","mum","del"},
				{"CHINA","chi","chu","cha","haa","hoo"},
				{"CHINA","chi","chu","cha","haa","hoo"},
				{"CHINA","chi","chu","cha","haa","hoo"},
				{"CHINA","chi","chu","cha","haa","hoo"},
				{"INDIA","bbsr","hyd","che","mum","del"},
				{"CHINA","chi","chu","cha","haa","hoo"},
				{"CHINA","chi","chu","cha","haa","hoo"},
				{"CHINA","chi","chu","cha","haa","hoo"},
				{"CHINA","chi","chu","cha","haa","hoo"}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
