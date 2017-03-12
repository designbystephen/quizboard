import React from 'react'
import { inject, observer } from 'mobx-react'

import Category from '../components/category';

// TODO: revisit route dom structure: seems odd to wrap index route in layout, as it makes for some awkward 
// nesting of divs
@inject(['store'])
export default class Index extends React.Component{
   /** @type {Array} array of categories */
  categories = this.props.store.categories

  /**
   * Reander components included in the index route markup
   * @return {Object} JSX markup
   */
  render() {
    return (
    	<div className="category-listing">
    		{this.categories.map((category, index) => (
    			<Category key={category.id} title={category.title} tiles={category.tiles} />
    		))}
    	</div>
    );
  }
}
