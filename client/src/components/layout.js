import React from 'react'
import { inject, observer } from 'mobx-react'

import Header from './header';

export default class Layout extends React.Component{
  render() {
    return (
    	<div className="layout">
	    	<Header />
	    	<main>
	    		{this.props.children}
	    	</main>
	    	<footer></footer>
    	</div>
    );
  }
}
