package com.chapter4;

import javax.swing.JOptionPane;

public class Analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int passes = 0;	//閫氳繃浜烘暟
		int failuress = 0;	//鏈�氳繃浜烘暟
		int studentCounter = 1;	//瀛︾敓浜烘暟鐨勮鏁板櫒
		int result;	//鑰冭瘯缁撴灉锛�1浠ｈ〃閫氳繃锛�2浠ｈ〃鏈�氳繃锛�
		
		String input;	//瀹氫箟 鎺ユ敹鐢ㄦ埛杈撳叆鐨勮�冭瘯缁撴灉 鐨勫彉閲�
		String output;	//瀹氫箟 杈撳嚭鏈�缁堝垎鏋愮粨鏋� 鐨勫彉閲�
		
		while (studentCounter <= 10) {	//寰幆锛屽鐢熶汉鏁颁笉澶т簬10鏃惰繘鍏ュ惊鐜紱鍚﹀垯閫�鍑哄惊鐜�
			
			input = JOptionPane.showInputDialog("Enter result (1 = pass, 2 = fail)");	//鍦ㄥ脊鍑烘涓緭鍏ヨ�冭瘯缁撴灉锛屽苟璧嬪�肩粰input
			
			result = Integer.parseInt(input);	//灏哠tring绫诲瀷鐨勮�冭瘯缁撴灉杞崲涓篿nt鍨嬶紝骞惰祴鍊肩粰result
			
			if (result == 1) { //if-else鏉′欢鍒ゆ柇锛宺esult涓�1鏃舵墽琛宨f璇彞
				passes = passes + 1;	//閫氳繃鑰冭瘯鐨勪汉鏁板姞1
			} else { //result涓嶄负1鏃舵墽琛宔lse璇彞
				failuress = failuress + 1;	//鏈�氳繃鑰冭瘯鐨勪汉鏁板姞1
			}	//if-else缁撴潫
			
			studentCounter = studentCounter + 1;	//瀛︾敓浜烘暟鍊煎姞1
		}	//while缁撴潫
		
		output = " Passed:" + passes + "\nFailed:" + failuress;	//缁檕utput鍙橀噺璧嬪��
		
		if (passes > 8) {	//鑻ラ�氳繃鑰冭瘯鐨勪汉鏁板ぇ浜�8鎵цif璇彞锛涘惁鍒欎笉鎵ц
			output = output + "\nRaise Tuition";	//鍦╫utput瀛楃涓插悗娣诲姞涓娾�滄彁楂樺璐光��
			
		}	//if缁撴潫
		
		JOptionPane.showMessageDialog(null, output, "Analysis of Examination Reults", 
				JOptionPane.INFORMATION_MESSAGE);	//鍦ㄦ彁绀烘涓樉绀猴細閫氳繃鑰冭瘯鐨勪汉鏁帮紝鏈�氳繃鑰冭瘯鐨勪汉鏁帮紝鑻ラ�氳繃浜烘暟瓒呰繃8杩樿鏄剧ず鈥滄彁楂樺璐光��
		System.out.println("lalalala");
		System.out.println("succeed!");
		
		System.exit(0);	//绋嬪簭閫�鍑�
		
	}

}
