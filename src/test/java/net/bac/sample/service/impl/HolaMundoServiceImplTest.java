package net.bac.sample.service.impl;

import net.bac.sample.service.HolaMundoService;
import net.bac.sample.service.config.AbstractApplicationConfigTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HolaMundoServiceImplTest extends AbstractApplicationConfigTest{

  
  @Autowired
  private HolaMundoService holaMundoService;
  
  @Before
  public void testInjection(){
    Assert.assertNotNull(holaMundoService);
  }
  
  @Test
  public void testDecirHola() {
    
    String unexpected = null;
    String actual =  holaMundoService.decirHola();
    
    
    Assert.assertNotEquals(unexpected, actual);
  }

}
