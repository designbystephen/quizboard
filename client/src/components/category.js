import React from 'react'
// import { inject, observer } from 'mobx-react'

import Tile from './tile';

export default class Category extends React.Component{
  render() {
	return (
		<div className="category">
			<Tile value="Category One" classModifier="tile--header" />
			<Tile value="100" />
		</div>
	);
  }
}
