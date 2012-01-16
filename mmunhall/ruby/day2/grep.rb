puts 'With line numbers:'
lines = IO.readlines('current_reading.txt')
lines.each_index {|i| puts "Line #{i+1}: #{lines[i]}" if /seven/i =~ lines[i]}

puts 'Without line number:'
IO.foreach('current_reading.txt') {|line| puts line if /seven/i =~ line}
