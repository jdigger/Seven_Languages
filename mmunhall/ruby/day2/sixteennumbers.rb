nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]

nums.each do |n|
    print "#{n} " 
    print "\n" if n % 4 == 0
end

nums.each_slice(4)  {|n| print "#{n} "} 
