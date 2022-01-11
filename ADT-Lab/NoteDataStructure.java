package lab2_ADT;

public class NoteDataStructure {
	public double value = 0.0;
	public String length = "";
	public String letter = "";
	public String sharp = "";
	public String keyColor = "";
	public double frequency = 0.0;
	
	public void Node(String length, double value) {
		this.length = length;
		this.value = value;
	}
	
	public String getLength() {
		return length;
	}
	
	public void setLength(String length) {
		this.length = length;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getLetter() {
		return letter;
	}
	
	public void setLetter() {
		if(value == -9) {
		    letter = "C";
	    
		}else if(value == -8) {
	    	letter = "C#";
	    
		}else if(value == -7) {
	         letter = "D";
		      
		}else if(value == -6) {
		      letter = "D#";
		      
		}else if(value == -5) {
		      letter = "E";
		      
		}else if(value == -4) {
		      letter = "F";
		      
		}else if(value == -3) {
		      letter = "F#";
		      
		}else if(value == -2) {
		      letter = "G";
		      
		}else if(value == -1) {
		      letter = "G#";
	    
		}else if(value == 0) {
		      letter = "A";
	    
		}else if(value == 1) {
		      letter = "A#";
	    
		}else if(value == 2) {
		      letter = "B";
		}else {
			 System.out.println("Invalid letter");
		}
	}
		
	public String getSharp() {
			return sharp;
	}
	
	public String setSharp(String sharp) {
		if(value == -8 || value == -6 || value == -3 ||
				value == -1 || value == 1) {
			sharp = "Sharp";
		} else {
			sharp = "Natural";
		}
		return sharp;
	}
	
	public String getKeyColor() {
		return keyColor;
	}
	
	public void setKeyColor(String keyColor) {
		if(value == -8 || value == -6 || value == -3 || 
				value == -1 || value == 1) {
			keyColor = "black";
		}else {
			keyColor = "white";
		}
	}
	
	public double getFrequency() {
		return frequency;
	}
	
	public double setFrequency(double frequency) {
		frequency = (440 * Math.pow(2, (value / 12)));
		return frequency;
	}
	
	
}


