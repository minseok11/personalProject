import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Frame1 extends JFrame{
	boolean pWin=true;//선 배팅권 설정
	int bettingCnt=0;//주고 받는 배팅 설정을 위한 설정값
	int bbingM=5000;//기본 배팅 단위
	int callM=0;//콜했을때 적용값
	int betM=0;//총 배팅금액 적용값
	int pBetM=0;//플레이어 배팅금액 적용값
	int cBetM=0;//컴퓨터 배팅금액 적용값
	int p1=0;//플레이어 첫번째 카드 key값
	int p2=0;//플레이어 두번째 카드 key값
	int c1=0;//컴퓨터 첫번째 카드 key값
	int c2=0;//컴퓨터 첫번째 카드 key값
	Random ranP1=new Random();//플레이어 첫번째 카드 뽑는 랜덤객체 생성
	Random ranP2=new Random();//플레이어 두번째 카드 뽑는 랜덤객체 생성
	Random ranC1=new Random();//컴퓨터 첫번째 카드 뽑는 랜덤객체 생성
	Random ranC2=new Random();//컴퓨터 두번째 카드 뽑는 랜덤객체 생성
	JButton card=new JButton("카드구분 및 족보");//카드구분 및 족보 버튼생성
	JButton call=new JButton("콜");//콜 버튼생성
	JButton die=new JButton("다이");//다이 버튼생성
	JButton ddadang=new JButton("따당");//따당 버튼생성
	JButton half=new JButton("하프");//하프 버튼생성
	JButton bbing=new JButton("삥");//삥 버튼생성
	JButton start=new JButton("게임시작");//게임시작 버튼생성
	JButton conti=new JButton("계속하기");//계속하기 버튼생성
	JButton end=new JButton("그만하기");//그만하기 버튼생성
	JButton betting=new JButton("배팅하기");//배팅하기 버튼생성
	JButton bettingEnd=new JButton("배팅완료");//배팅완료 버튼생성
	JLabel p1Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//플레이어 첫번째 카드 나올자리 객체생성
	JLabel p2Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//플레이어 두번째 카드 나올자리 객체생성
	JLabel c1Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//컴퓨터 첫번째 카드 나올자리 객체생성
	JLabel c2Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//컴퓨터 두번째 카드 나올자리 객체생성
	JLabel tMoneyL=new JLabel("총 베팅금액");//총 배팅금액 라벨생성
	JLabel pMoneyL=new JLabel("플레이어 돈");//플레이어 잔액 라벨생성
	JLabel cMoneyL=new JLabel("컴퓨터 돈");//컴퓨터 잔액 라벨생성
	JTextField tMoney=new JTextField(15);//총 배팅금액 텍스트필드생성
	JTextField pMoney=new JTextField(15);//플레이어 잔액 텍스트필드생성
	JTextField cMoney=new JTextField(15);//컴퓨터 잔액 텍스트필드생성
	HashMap<Integer,ImageIcon> hm=new HashMap<Integer,ImageIcon>();//해쉬맵 생성
	public Frame1(){//프레임1 디폴트생성자
	hm.put(0, new ImageIcon("c:\\jpg\\1_1.jpg"));//카드 Key와 Value로 맵에 담음
	hm.put(10, new ImageIcon("c:\\jpg\\1_2.jpg"));
	hm.put(1, new ImageIcon("c:\\jpg\\2_1.jpg"));
	hm.put(11, new ImageIcon("c:\\jpg\\2_2.jpg"));
	hm.put(2, new ImageIcon("c:\\jpg\\3_1.jpg"));
	hm.put(12, new ImageIcon("c:\\jpg\\3_2.jpg"));
	hm.put(3, new ImageIcon("c:\\jpg\\4_1.jpg"));
	hm.put(13, new ImageIcon("c:\\jpg\\4_2.jpg"));
	hm.put(4, new ImageIcon("c:\\jpg\\5_1.jpg"));
	hm.put(14, new ImageIcon("c:\\jpg\\5_2.jpg"));
	hm.put(5, new ImageIcon("c:\\jpg\\6_1.jpg"));
	hm.put(15, new ImageIcon("c:\\jpg\\6_2.jpg"));
	hm.put(6, new ImageIcon("c:\\jpg\\7_1.jpg"));
	hm.put(16, new ImageIcon("c:\\jpg\\7_2.jpg"));
	hm.put(7, new ImageIcon("c:\\jpg\\8_1.jpg"));
	hm.put(17, new ImageIcon("c:\\jpg\\8_2.jpg"));
	hm.put(8, new ImageIcon("c:\\jpg\\9_1.jpg"));
	hm.put(18, new ImageIcon("c:\\jpg\\9_2.jpg"));
	hm.put(9, new ImageIcon("c:\\jpg\\10_1.jpg"));
	hm.put(19, new ImageIcon("c:\\jpg\\10_2.jpg"));
	setSize(800,800);//GUI사이즈 조정
	setLayout(null);//레이아웃 설정
	add(card);//각종 버튼 및 기타 효과 추가 및 레이아웃 설정
	card.setBounds(600, 300, 150, 50);
	add(start);
	start.setBounds(20, 20, 100, 50);
	add(conti);
	conti.setBounds(350, 20, 100, 50);
	add(end);
	end.setBounds(650, 20, 100, 50);
	add(call);
	call.setBounds(20, 700, 100, 50);
	add(ddadang);
	ddadang.setBounds(180, 700, 100, 50);
	add(bbing);
	bbing.setBounds(340, 700, 100, 50);
	add(half);
	half.setBounds(500, 700, 100, 50);
	add(die);
	die.setBounds(660, 700, 100, 50);
	add(betting);
	betting.setBounds(20, 630, 100, 50);
	add(bettingEnd);
	bettingEnd.setBounds(180, 630, 100, 50);
	add(tMoneyL);
	tMoneyL.setBounds(293, 300, 100, 50);
	add(pMoneyL);
	pMoneyL.setBounds(680, 550, 100, 50);
	add(cMoneyL);
	cMoneyL.setBounds(680, 150, 100, 50);
	add(tMoney);
	tMoney.setBounds(270, 350, 120, 40);
	add(pMoney);
	pMoney.setBounds(650, 600, 120, 30);
	add(cMoney);
	cMoney.setBounds(650, 100, 120, 30);
	add(p1Label);
	p1Label.setBounds(200, 400, 100, 100);
	add(p2Label);
	p2Label.setBounds(350, 400, 100, 100);
	add(c1Label);
	c1Label.setBounds(200, 200, 100, 100);
	add(c2Label);
	c2Label.setBounds(350, 200, 100, 100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 종료키 눌렀을때 종료되도록
	setVisible(true);//GUI 보이게끔 설정
	ButtonListener btn=new ButtonListener();//버튼리스너 객체생성
		conti.setEnabled(false);//버튼이 상황에 따라 누를 수 있는 상태와 없는 상태로 설정
		call.setEnabled(false);
		betting.setEnabled(false);
		half.setEnabled(false);
		bbing.setEnabled(false);
		die.setEnabled(false);
		ddadang.setEnabled(false);
		bettingEnd.setEnabled(false);
		card.addActionListener(btn);//버튼 ActionListener 효과 적용
		start.addActionListener(btn);
		conti.addActionListener(btn);
		end.addActionListener(btn);
		call.addActionListener(btn);
		betting.addActionListener(btn);
		half.addActionListener(btn);
		bbing.addActionListener(btn);
		die.addActionListener(btn);
		ddadang.addActionListener(btn);
		bettingEnd.addActionListener(btn);
		}
	class ButtonListener implements ActionListener{//이너클래스(ActionListener)
		@Override
		public void actionPerformed(ActionEvent e) {//actionPerformed 오버라이딩
			Object obj=e.getSource();
			try{
				//족보버튼 눌렀을때 OptionDialog를 통해 안내창을 볼수 있도록
				if(obj==card)JOptionPane.showOptionDialog(null, "\r\n해당 그림 아래에 있는 숫자가 카드의 번호입니다.\r\n예를들면 1_1은 1카드, 1_2도 1카드입니다."
		+ "\r\n만약 같은 숫자의 카드가 나온다면 땡, 아니라면 끗이 되며, \r\n끗은 두 카드 번호 합의 1의 자릿수가 점수가 됩니다."
		+ "땡은 모든 끗을 이기고, \r\n땡끼리는 보다 높은 땡이 승리합니다.", "카드구분 및 족보", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("c:\\jpg\\card.jpg"), null, null);
			}catch(HeadlessException he){
				System.out.println(he.getMessage());
			}
			if(obj==start){//시작버튼을 눌렀을때의 Action
				start.setEnabled(false);
				call.setEnabled(true);
				half.setEnabled(true);
				bbing.setEnabled(true);
				die.setEnabled(true);
				ddadang.setEnabled(true);
				bettingEnd.setEnabled(true);
				p1=ranP1.nextInt(19);
				p1Label.setIcon(hm.get(p1));
				while(true){//충복된 카드가 뽑히지 않도록 루프를 돌림
				p2=ranP2.nextInt(19);
				if(p2==p1){
					p2=ranP2.nextInt(19);
				}else{
					break;
				}
				}
				p2Label.setIcon(hm.get(p2));
				while(true){
				c1=ranC1.nextInt(19);
				if(c1==p1||c1==p2){
					c1=ranC1.nextInt(19);
				}else{
					break;
				}
				}
				while(true){
				c2=ranC2.nextInt(19);
				if(c2==p1||c2==p2||c2==c1){
					c2=ranC2.nextInt(19);
				}else{
					break;
				}
				}
				pMoney.setText("100000000");//초기 세팅
				cMoney.setText("100000000");
				tMoney.setText("");
				callM=0;
				betM=0;
				pBetM=0;
				cBetM=0;
				int pmi=Integer.parseInt(pMoney.getText());//기본배팅 적용
				pmi-=bbingM;
				betM+=bbingM;
				pBetM+=bbingM;
				pMoney.setText(String.valueOf(pmi));
				tMoney.setText(String.valueOf(betM));
				int cmi=Integer.parseInt(cMoney.getText());
				cmi-=bbingM;
				betM+=bbingM;
				cBetM+=bbingM;
				cMoney.setText(String.valueOf(cmi));
				tMoney.setText(String.valueOf(betM));
			}//다시하기 버튼 눌렀을 때 Action
			if(obj==conti){
				bettingCnt=0;
				conti.setEnabled(false);
				if(!pWin){//플레이어가 졌을경우 배팅순서
					betting.setEnabled(true);
					bettingEnd.setEnabled(true);
				}else{//플레이어가 이겼을 경우 배팅순서
					call.setEnabled(true);
					half.setEnabled(true);
					bbing.setEnabled(true);
					die.setEnabled(true);
					ddadang.setEnabled(true);
					bettingEnd.setEnabled(true);
				}//새로 카드창을 초기화하고 새로운 카드를 뽑음
				c1Label.setIcon(new ImageIcon("c:\\jpg\\default.jpg"));
				c2Label.setIcon(new ImageIcon("c:\\jpg\\default.jpg"));
				p1=0;
				p2=0;
				c1=0;
				c2=0;
				p1=ranP1.nextInt(19);
				p1Label.setIcon(hm.get(p1));
				while(true){
				p2=ranP2.nextInt(19);
				if(p2==p1){
					p2=ranP2.nextInt(19);
				}else{
					break;
				}
				}
				p2Label.setIcon(hm.get(p2));
				while(true){
				c1=ranC1.nextInt(19);
				if(c1==p1||c1==p2){
					c1=ranC1.nextInt(19);
				}else{
					break;
				}
				}
				while(true){
				c2=ranC2.nextInt(19);
				if(c2==p1||c2==p2||c2==c1){
					c2=ranC2.nextInt(19);
				}else{
					break;
				}
				}
				tMoney.setText("");//초기세팅
				callM=0;
				betM=0;
				pBetM=0;
				cBetM=0;
				int pmi=Integer.parseInt(pMoney.getText());//기본배팅적용
				pmi-=bbingM;
				betM+=bbingM;
				pBetM+=bbingM;
				pMoney.setText(String.valueOf(pmi));
				tMoney.setText(String.valueOf(betM));
				int cmi=Integer.parseInt(cMoney.getText());
				cmi-=bbingM;
				betM+=bbingM;
				cBetM+=bbingM;
				cMoney.setText(String.valueOf(cmi));
				tMoney.setText(String.valueOf(betM));
			}
			if(obj==end)System.exit(0);//종료 키 눌렀을 경우 종료
			if(obj==call){//콜 버튼 눌렀을 경우
				bettingCnt++;
				call.setEnabled(false);
				betting.setEnabled(false);
				half.setEnabled(false);
				bbing.setEnabled(false);
				die.setEnabled(false);
				ddadang.setEnabled(false);
				String pm=pMoney.getText();
				int pmi=Integer.parseInt(pm);
				callM=cBetM;
				pmi-=callM;
				pBetM+=callM;
				pMoney.setText(String.valueOf(pmi));
				betM+=callM;
				String betMoney=String.valueOf(betM);
				tMoney.setText(betMoney);
				betting.setEnabled(true);
			}
			if(obj==betting){//배팅 버튼 눌렀을 경우
				try{
				Thread.sleep(500);//0.5초 딜레이
				}catch(Exception ie){
					System.out.println(ie.getMessage());
				}
				bettingCnt++;
				betting.setEnabled(false);
				call.setEnabled(true);
				half.setEnabled(true);
				bbing.setEnabled(true);
				die.setEnabled(true);
				ddadang.setEnabled(true);
				Random ran4=new Random();
				int com=ran4.nextInt(3);//컴퓨터가 무엇을 배팅할지 랜덤값 설정
				if(com==0){
					int cmi=Integer.parseInt(cMoney.getText());
					cmi-=bbingM;
					betM+=bbingM;
					cBetM+=bbingM;
					cMoney.setText(String.valueOf(cmi));
					tMoney.setText(String.valueOf(betM));			
				}
				if(com==1){
					int cmi=Integer.parseInt(cMoney.getText());
					callM=pBetM;
					cmi-=callM;
					betM+=callM;
					cBetM+=callM;
					cMoney.setText(String.valueOf(cmi));
					tMoney.setText(String.valueOf(betM));
				}
				if(com==2){
					int cmi=Integer.parseInt(cMoney.getText());
					cmi-=(betM/2)+callM;
					betM+=(betM/2)+callM;
					cBetM+=(betM/2)+callM;
					cMoney.setText(String.valueOf(cmi));
					tMoney.setText(String.valueOf(betM));
				}
				if(com==3){
					int cmi=Integer.parseInt(cMoney.getText());
					cmi-=pBetM*2;
					betM+=pBetM*2;
					cBetM+=pBetM*2;
					cMoney.setText(String.valueOf(cmi));
					tMoney.setText(String.valueOf(betM));
				}
			}
			if(obj==bbing){//삥 버튼 눌렀을 경우 Action
				bettingCnt++;
				call.setEnabled(false);
				betting.setEnabled(false);
				half.setEnabled(false);
				bbing.setEnabled(false);
				die.setEnabled(false);
				ddadang.setEnabled(false);
				int pmi=Integer.parseInt(pMoney.getText());
				pmi-=bbingM;
				betM+=bbingM;
				pBetM+=bbingM;
				pMoney.setText(String.valueOf(pmi));
				tMoney.setText(String.valueOf(betM));
				betting.setEnabled(true);
			}
			if(obj==half){//하프 버튼 눌렀을경우 Action
				bettingCnt++;
				call.setEnabled(false);
				betting.setEnabled(false);
				half.setEnabled(false);
				bbing.setEnabled(false);
				die.setEnabled(false);
				ddadang.setEnabled(false);
				int pmi=Integer.parseInt(pMoney.getText());
				pmi-=(betM/2)+callM;
				betM+=(betM/2)+callM;
				pBetM+=(betM/2)+callM;
				pMoney.setText(String.valueOf(pmi));
				tMoney.setText(String.valueOf(betM));
				betting.setEnabled(true);
			}
			if(obj==ddadang){//따당 버튼 눌렀을경우 Action
				bettingCnt++;
				call.setEnabled(false);
				betting.setEnabled(false);
				half.setEnabled(false);
				bbing.setEnabled(false);
				die.setEnabled(false);
				ddadang.setEnabled(false);
				int pmi=Integer.parseInt(pMoney.getText());
				pmi-=cBetM*2;
				betM+=cBetM*2;
				pBetM+=cBetM*2;
				pMoney.setText(String.valueOf(pmi));
				tMoney.setText(String.valueOf(betM));
				betting.setEnabled(true);
			}
			if(obj==die){//다이 버튼 눌렀을 경우 Action
				int cmi=Integer.parseInt(cMoney.getText());
				cmi+=betM;
				cMoney.setText(String.valueOf(cmi));
				conti.setEnabled(true);
				call.setEnabled(false);
				betting.setEnabled(false);
				half.setEnabled(false);
				bbing.setEnabled(false);
				die.setEnabled(false);
				ddadang.setEnabled(false);
				bettingEnd.setEnabled(false);
				pWin=false;
			}
			if(obj==bettingEnd){//배팅종료 버튼 눌렀을 경우 Action
				if(bettingCnt==0||bettingCnt%2!=0){//서로 배팅을 주고받지 않은채 눌렀을경우의 메세지
					JOptionPane.showMessageDialog(null,"상대의 배팅을 받지 않았습니다. 배팅 후 다시 눌러주세요.");
					return;//버튼 누르기 전 상태로 돌아감
				}//컴퓨터와 플레이어 패 점수 계산
				c1Label.setIcon(hm.get(c1));
				c2Label.setIcon(hm.get(c2));
				if(p1+1==10&&p2+1==10){
					p1=100;
				}else if((p1+1)%10==(p2+1)%10){
					p1=((p1+1)%10)*10;
				}else if(((p1+1)%10!=(p2+1)%10)){
					p1=((p1+p2+2)%10);
				}
				if(c1+1==10&&c2+1==10){
					c1=100;
				}else if((c1+1)%10==(c2+1)%10){
					c1=((c1+1)%10)*10;
				}else if(((c1+1)%10!=(c2+1)%10)){
					c1=((c1+c2+2)%10);
				}
				try{
					Thread.sleep(500);//0.5초 딜레이
					}catch(Exception ie){
						System.out.println(ie.getMessage());
					}
				if(p1>c1){//플레이어가 이겼을 경우
					int pmi=Integer.parseInt(pMoney.getText())+Integer.parseInt(tMoney.getText());
					pMoney.setText(String.valueOf(pmi));
					JOptionPane.showMessageDialog(null, "승리하셨습니다!!!");
					pWin=true;
					conti.setEnabled(true);
					call.setEnabled(false);
					betting.setEnabled(false);
					half.setEnabled(false);
					bbing.setEnabled(false);
					die.setEnabled(false);
					ddadang.setEnabled(false);
					bettingEnd.setEnabled(false);
					if(Integer.parseInt(cMoney.getText())<=0){//컴퓨터가 파산했을 경우
						JOptionPane.showMessageDialog(null, "축하합니다. 컴퓨터를 올인시켰습니다!!");
						System.exit(0);
					}
				}
				if(c1>p1){//컴퓨터가 이겼을 경우
					int cmi=Integer.parseInt(cMoney.getText())+Integer.parseInt(tMoney.getText());
					cMoney.setText(String.valueOf(cmi));
					JOptionPane.showMessageDialog(null, "패배하셨습니다...");
					pWin=false;
					conti.setEnabled(true);
					call.setEnabled(false);
					betting.setEnabled(false);
					half.setEnabled(false);
					bbing.setEnabled(false);
					die.setEnabled(false);
					ddadang.setEnabled(false);
					bettingEnd.setEnabled(false);
					if(Integer.parseInt(pMoney.getText())<=0){//플레이어가 파산당했을 경우
						JOptionPane.showMessageDialog(null, "당신은 올인당했습니다...");
						System.exit(0);
					}
				}
				if(c1==p1){//비겼을 경우 재경기
					JOptionPane.showMessageDialog(null, "비겼습니다. 게임을 다시 시작합니다.");
					c1Label.setIcon(new ImageIcon("c:\\jpg\\default.jpg"));
					c2Label.setIcon(new ImageIcon("c:\\jpg\\default.jpg"));
					p1=0;
					p2=0;
					c1=0;
					c2=0;
					p1=ranP1.nextInt(19);
					p1Label.setIcon(hm.get(p1));
					while(true){
					p2=ranP2.nextInt(19);
					if(p2==p1){
						p2=ranP2.nextInt(19);
					}else{
						break;
					}
					}
					p2Label.setIcon(hm.get(p2));
					while(true){
					c1=ranC1.nextInt(19);
					if(c1==p1||c1==p2){
						c1=ranC1.nextInt(19);
					}else{
						break;
					}
					}
					while(true){
					c2=ranC2.nextInt(19);
					if(c2==p1||c2==p2||c2==c1){
						c2=ranC2.nextInt(19);
					}else{
						break;
					}
					}
				}
			}
		}
	}
}
public class Game {//메인메소드
	public static void main(String[] args) {
		new Frame1();//프레임1 클래스 실행(디폴트 생성자 실행)
	}
}