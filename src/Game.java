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
	boolean pWin=true;//�� ���ñ� ����
	int bettingCnt=0;//�ְ� �޴� ���� ������ ���� ������
	int bbingM=5000;//�⺻ ���� ����
	int callM=0;//�������� ���밪
	int betM=0;//�� ���ñݾ� ���밪
	int pBetM=0;//�÷��̾� ���ñݾ� ���밪
	int cBetM=0;//��ǻ�� ���ñݾ� ���밪
	int p1=0;//�÷��̾� ù��° ī�� key��
	int p2=0;//�÷��̾� �ι�° ī�� key��
	int c1=0;//��ǻ�� ù��° ī�� key��
	int c2=0;//��ǻ�� ù��° ī�� key��
	Random ranP1=new Random();//�÷��̾� ù��° ī�� �̴� ������ü ����
	Random ranP2=new Random();//�÷��̾� �ι�° ī�� �̴� ������ü ����
	Random ranC1=new Random();//��ǻ�� ù��° ī�� �̴� ������ü ����
	Random ranC2=new Random();//��ǻ�� �ι�° ī�� �̴� ������ü ����
	JButton card=new JButton("ī�屸�� �� ����");//ī�屸�� �� ���� ��ư����
	JButton call=new JButton("��");//�� ��ư����
	JButton die=new JButton("����");//���� ��ư����
	JButton ddadang=new JButton("����");//���� ��ư����
	JButton half=new JButton("����");//���� ��ư����
	JButton bbing=new JButton("��");//�� ��ư����
	JButton start=new JButton("���ӽ���");//���ӽ��� ��ư����
	JButton conti=new JButton("����ϱ�");//����ϱ� ��ư����
	JButton end=new JButton("�׸��ϱ�");//�׸��ϱ� ��ư����
	JButton betting=new JButton("�����ϱ�");//�����ϱ� ��ư����
	JButton bettingEnd=new JButton("���ÿϷ�");//���ÿϷ� ��ư����
	JLabel p1Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//�÷��̾� ù��° ī�� �����ڸ� ��ü����
	JLabel p2Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//�÷��̾� �ι�° ī�� �����ڸ� ��ü����
	JLabel c1Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//��ǻ�� ù��° ī�� �����ڸ� ��ü����
	JLabel c2Label=new JLabel(new ImageIcon("c:\\jpg\\default.jpg"));//��ǻ�� �ι�° ī�� �����ڸ� ��ü����
	JLabel tMoneyL=new JLabel("�� ���ñݾ�");//�� ���ñݾ� �󺧻���
	JLabel pMoneyL=new JLabel("�÷��̾� ��");//�÷��̾� �ܾ� �󺧻���
	JLabel cMoneyL=new JLabel("��ǻ�� ��");//��ǻ�� �ܾ� �󺧻���
	JTextField tMoney=new JTextField(15);//�� ���ñݾ� �ؽ�Ʈ�ʵ����
	JTextField pMoney=new JTextField(15);//�÷��̾� �ܾ� �ؽ�Ʈ�ʵ����
	JTextField cMoney=new JTextField(15);//��ǻ�� �ܾ� �ؽ�Ʈ�ʵ����
	HashMap<Integer,ImageIcon> hm=new HashMap<Integer,ImageIcon>();//�ؽ��� ����
	public Frame1(){//������1 ����Ʈ������
	hm.put(0, new ImageIcon("c:\\jpg\\1_1.jpg"));//ī�� Key�� Value�� �ʿ� ����
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
	setSize(800,800);//GUI������ ����
	setLayout(null);//���̾ƿ� ����
	add(card);//���� ��ư �� ��Ÿ ȿ�� �߰� �� ���̾ƿ� ����
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
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ ����Ű �������� ����ǵ���
	setVisible(true);//GUI ���̰Բ� ����
	ButtonListener btn=new ButtonListener();//��ư������ ��ü����
		conti.setEnabled(false);//��ư�� ��Ȳ�� ���� ���� �� �ִ� ���¿� ���� ���·� ����
		call.setEnabled(false);
		betting.setEnabled(false);
		half.setEnabled(false);
		bbing.setEnabled(false);
		die.setEnabled(false);
		ddadang.setEnabled(false);
		bettingEnd.setEnabled(false);
		card.addActionListener(btn);//��ư ActionListener ȿ�� ����
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
	class ButtonListener implements ActionListener{//�̳�Ŭ����(ActionListener)
		@Override
		public void actionPerformed(ActionEvent e) {//actionPerformed �������̵�
			Object obj=e.getSource();
			try{
				//������ư �������� OptionDialog�� ���� �ȳ�â�� ���� �ֵ���
				if(obj==card)JOptionPane.showOptionDialog(null, "\r\n�ش� �׸� �Ʒ��� �ִ� ���ڰ� ī���� ��ȣ�Դϴ�.\r\n������� 1_1�� 1ī��, 1_2�� 1ī���Դϴ�."
		+ "\r\n���� ���� ������ ī�尡 ���´ٸ� ��, �ƴ϶�� ���� �Ǹ�, \r\n���� �� ī�� ��ȣ ���� 1�� �ڸ����� ������ �˴ϴ�."
		+ "���� ��� ���� �̱��, \r\n�������� ���� ���� ���� �¸��մϴ�.", "ī�屸�� �� ����", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("c:\\jpg\\card.jpg"), null, null);
			}catch(HeadlessException he){
				System.out.println(he.getMessage());
			}
			if(obj==start){//���۹�ư�� ���������� Action
				start.setEnabled(false);
				call.setEnabled(true);
				half.setEnabled(true);
				bbing.setEnabled(true);
				die.setEnabled(true);
				ddadang.setEnabled(true);
				bettingEnd.setEnabled(true);
				p1=ranP1.nextInt(19);
				p1Label.setIcon(hm.get(p1));
				while(true){//�溹�� ī�尡 ������ �ʵ��� ������ ����
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
				pMoney.setText("100000000");//�ʱ� ����
				cMoney.setText("100000000");
				tMoney.setText("");
				callM=0;
				betM=0;
				pBetM=0;
				cBetM=0;
				int pmi=Integer.parseInt(pMoney.getText());//�⺻���� ����
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
			}//�ٽ��ϱ� ��ư ������ �� Action
			if(obj==conti){
				bettingCnt=0;
				conti.setEnabled(false);
				if(!pWin){//�÷��̾ ������� ���ü���
					betting.setEnabled(true);
					bettingEnd.setEnabled(true);
				}else{//�÷��̾ �̰��� ��� ���ü���
					call.setEnabled(true);
					half.setEnabled(true);
					bbing.setEnabled(true);
					die.setEnabled(true);
					ddadang.setEnabled(true);
					bettingEnd.setEnabled(true);
				}//���� ī��â�� �ʱ�ȭ�ϰ� ���ο� ī�带 ����
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
				tMoney.setText("");//�ʱ⼼��
				callM=0;
				betM=0;
				pBetM=0;
				cBetM=0;
				int pmi=Integer.parseInt(pMoney.getText());//�⺻��������
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
			if(obj==end)System.exit(0);//���� Ű ������ ��� ����
			if(obj==call){//�� ��ư ������ ���
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
			if(obj==betting){//���� ��ư ������ ���
				try{
				Thread.sleep(500);//0.5�� ������
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
				int com=ran4.nextInt(3);//��ǻ�Ͱ� ������ �������� ������ ����
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
			if(obj==bbing){//�� ��ư ������ ��� Action
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
			if(obj==half){//���� ��ư ��������� Action
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
			if(obj==ddadang){//���� ��ư ��������� Action
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
			if(obj==die){//���� ��ư ������ ��� Action
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
			if(obj==bettingEnd){//�������� ��ư ������ ��� Action
				if(bettingCnt==0||bettingCnt%2!=0){//���� ������ �ְ���� ����ä ����������� �޼���
					JOptionPane.showMessageDialog(null,"����� ������ ���� �ʾҽ��ϴ�. ���� �� �ٽ� �����ּ���.");
					return;//��ư ������ �� ���·� ���ư�
				}//��ǻ�Ϳ� �÷��̾� �� ���� ���
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
					Thread.sleep(500);//0.5�� ������
					}catch(Exception ie){
						System.out.println(ie.getMessage());
					}
				if(p1>c1){//�÷��̾ �̰��� ���
					int pmi=Integer.parseInt(pMoney.getText())+Integer.parseInt(tMoney.getText());
					pMoney.setText(String.valueOf(pmi));
					JOptionPane.showMessageDialog(null, "�¸��ϼ̽��ϴ�!!!");
					pWin=true;
					conti.setEnabled(true);
					call.setEnabled(false);
					betting.setEnabled(false);
					half.setEnabled(false);
					bbing.setEnabled(false);
					die.setEnabled(false);
					ddadang.setEnabled(false);
					bettingEnd.setEnabled(false);
					if(Integer.parseInt(cMoney.getText())<=0){//��ǻ�Ͱ� �Ļ����� ���
						JOptionPane.showMessageDialog(null, "�����մϴ�. ��ǻ�͸� ���ν��׽��ϴ�!!");
						System.exit(0);
					}
				}
				if(c1>p1){//��ǻ�Ͱ� �̰��� ���
					int cmi=Integer.parseInt(cMoney.getText())+Integer.parseInt(tMoney.getText());
					cMoney.setText(String.valueOf(cmi));
					JOptionPane.showMessageDialog(null, "�й��ϼ̽��ϴ�...");
					pWin=false;
					conti.setEnabled(true);
					call.setEnabled(false);
					betting.setEnabled(false);
					half.setEnabled(false);
					bbing.setEnabled(false);
					die.setEnabled(false);
					ddadang.setEnabled(false);
					bettingEnd.setEnabled(false);
					if(Integer.parseInt(pMoney.getText())<=0){//�÷��̾ �Ļ������ ���
						JOptionPane.showMessageDialog(null, "����� ���δ��߽��ϴ�...");
						System.exit(0);
					}
				}
				if(c1==p1){//����� ��� ����
					JOptionPane.showMessageDialog(null, "�����ϴ�. ������ �ٽ� �����մϴ�.");
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
public class Game {//���θ޼ҵ�
	public static void main(String[] args) {
		new Frame1();//������1 Ŭ���� ����(����Ʈ ������ ����)
	}
}