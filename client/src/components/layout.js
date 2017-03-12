import React from 'react'
// import { inject, observer } from 'mobx-react'

export default class Layout extends React.Component{
  render() {
    return (
    	<div className="layout">
	    	<header></header>
	    	<main>
	    		{this.props.children}
	    	</main>
	    	<footer></footer>
    	</div>
    );
  }
}
