package test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	JTextField tf;
	JPanel panel;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;

	String val1 = null, val2 = null, sign = null; // val1과 va2는 피연산자, sign은 연산자
	Double result = 0.0; // 연산의 결과를 저장

	public Calculator() {
		// 닫기 버튼을 누르면 메모리에서 해제
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // 프레임 창 사이즈 고정

		// 컴포넌트 객체 생성
		tf = new JTextField("0", 20); // 초기 0을 출력, 크기 20
		tf.setHorizontalAlignment(JTextField.RIGHT); // 초기 0을 오른쪽 정렬
		b1 = new JButton("<-");
		b2 = new JButton("ce");
		b3 = new JButton("c");
		b4 = new JButton("/");
		b5 = new JButton("7");
		b6 = new JButton("8");
		b7 = new JButton("9");
		b8 = new JButton("*");
		b9 = new JButton("4");
		b10 = new JButton("5");
		b11 = new JButton("6");
		b12 = new JButton("-");
		b13 = new JButton("1");
		b14 = new JButton("2");
		b15 = new JButton("3");
		b16 = new JButton("+");
		b17 = new JButton("0");
		b18 = new JButton("00");
		b19 = new JButton(".");
		b20 = new JButton("=");

		// 패널을 레이아웃변경
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4, 2, 2));

		// 패널에 버튼을 부착
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		panel.add(b19);
		panel.add(b20);

		// 프레임에 부착
		add(tf, "North");
		add(panel);

		// 버튼에 이벤트룰 부착
		// implements ActionListener - 내 클래스에서 받았으므로 this
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);

		setTitle("Calculator");
		setSize(230, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override // interface를 구현하였으므로 ActionListener의 actionPerformed 오버라이딩 필요
	public void actionPerformed(ActionEvent e) {

		String data = e.getActionCommand(); // 버튼의 라벨값을 리턴

		if (data.equals("0") || data.equals("1") || data.equals("2") || data.equals("3") || data.equals("4")
				|| data.equals("5") || data.equals("6") || data.equals("7") || data.equals("8") || data.equals("9")
				|| data.equals("00")) {
			if ((tf.getText()).equals("0") || (tf.getText()).equals("00"))
				tf.setText(""); // 최초 0이아닌 다른 숫자를 누르면 공백으로 초기화
			val1 = tf.getText() + data; // 숫자를 이어서 붙여줌
			tf.setText(val1); // 해당 값을 TextField에 set
		}

		if (data.equals(".")) {
			if ((tf.getText()).equals("0") || (tf.getText()).equals("00"))
				tf.setText("0"); // 소수점 연산시 0이 첫 자리에 들어갔을 때 공백으로 초기화 시키는 것을 방지
			val1 = tf.getText() + data; // 숫자를 이어서 붙여줌
			tf.setText(val1); // 해당 값을 TextField에 set
		}

		if (data.equals("+") || data.equals("-") | data.equals("*") | data.equals("/") | data.equals("=")) {
			if (data.equals("+")) { // 더하기 연산
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "+";
			}

			if (data.equals("-")) { // 빼기 연산
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "-";
			}

			if (data.equals("*")) { // 곱하기 연산
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "*";
			}

			if (data.equals("/")) { // 나누기 연산
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "/";
			}

			if (data.equals("=")) { // = 연산
				if (sign.equals("+")) // 더하기 연산 - 소수점 계산을 위해서 Double형으로 반환
					result = Double.parseDouble(val2) + Double.parseDouble(val1);

				if (sign.equals("-")) // 빼기 연산 - 소수점 계산을 위해서 Double형으로 반환
					result = Double.parseDouble(val2) - Double.parseDouble(val1);

				if (sign.equals("*")) // 곱하기 연산 - 소수점 계산을 위해서 Double형으로 반환
					result = Double.parseDouble(val2) * Double.parseDouble(val1);

				if (sign.equals("/")) // 나누기 연산 - 소수점 계산을 위해서 Double형으로 반환
					result = Double.parseDouble(val2) / Double.parseDouble(val1);

				tf.setText("");
				// val2 = String.valueOf(result);
				// tf.setText(val2);
				val2 = String.format("%.2f", result); // 소수점 밑 2자리 까지만 출력
				tf.setText(val2); // 해당 값을 TextField에 set
				val1 = null;
			}
		}

		if (data.equals("ce")) { // 두번째 피연산자를 초기화
			tf.setText("0");
			val1 = null;
		}

		if (data.equals("c")) { // 계산기 전체를 초기화
			tf.setText("0");
			val1 = null;
			val2 = null;
			result = 0.0;
		}

		if (data.equals("<-")) { // BackSpace
			val1 = tf.getText();
			char ch[];
			String temp;

			ch = val1.toCharArray(); // val1에 String형 피연산자를 배열로 받는다.
			ch[ch.length - 1] = '\n'; // 가장 최근에 입력받은 숫자를 null값으로 바꾼다.
			String str = new String(ch);
			temp = str.substring(0, ch.length - 1); // 0번부터 null값 전까지 substring으로 잘라서 저장
			val1 = temp;
			tf.setText(temp); // 해당 값을 TextField에 set
		}
	}
}