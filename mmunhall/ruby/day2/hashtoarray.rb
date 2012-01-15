myhash = {'one' => 1, 'two' => 2, 'three' => 3}
myarray = myhash.collect {|key,value| value}
myarray.each {|value| puts value}
