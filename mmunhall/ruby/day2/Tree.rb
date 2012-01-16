class Tree
    attr_accessor :name, :children
    
    def initialize(nodes={})
        @name = nodes.keys().first # we assume there will be only one tree (i.e., one root node)
        @children = []
	
	nodes[name].each {|key,value| @children.push({key => value})}
    end

    def visit_all(&block)
        visit &block
	children.each {|c| Tree.new(c).visit_all &block}
    end

    def visit(&block)
        block.call name
    end
end

betterTree = Tree.new({
    'grandpa' => {
        'dad' => {
            'child1' => {},
            'child2' => {
                'grandchild1' => {},
                'grandchild2' => {}
            }
        },
        'uncle' => {
            'child3' => {},
            'child4' => {}
        }
    }
})

puts 'Visit a node'
betterTree.visit {|name| puts name}

puts 'Visit tree'
betterTree.visit_all {|name| puts name}
