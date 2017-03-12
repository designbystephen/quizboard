import React from 'react'
// import { inject, observer } from 'mobx-react'

import Category from '../components/category';

// TODO: revisit route dom structure: seems odd to wrap index route in layout, as it makes for some awkward 
// nesting of divs

export default class Index extends React.Component{
  render() {
    return (
    	<div>
    		<Category />
    	</div>
    );
  }
}
