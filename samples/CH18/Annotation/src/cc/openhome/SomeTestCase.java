package cc.openhome;

@TestClass({Some.class, Util.class})
public class SomeTestCase {
    @Test
    public void testDoSome() {
        
    }
    
    @Test2(timeout = 10)
    public void testDoSome2() {
        
    }
    
    @Test3(args = {"arg1", "arg2"})
    public void testDoSome3() {
        
    }
    
    @Ignore("message")
    public void testDoSome4() {
        
    }
    
    @Test4
    public void testDoSome5() {
        
    }
    
        
    @Test5
    public void testDoSome6() {
        
    }
    
    @Test9
    public void testDoSome9() {
        
    }
}

