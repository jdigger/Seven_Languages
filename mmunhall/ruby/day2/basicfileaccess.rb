# Use File.new to print each line of a file.
puts 'Using File.new:'
newFile = File.new('current_reading.txt', 'r')
newFile.each_line {|line| puts line}
newFile.close

# Use file.open ot print each line of a file. This method is more compact and automatically closes the file.
puts 'Using IO.foreach:'
IO.foreach('current_reading.txt') {|line| puts line}
